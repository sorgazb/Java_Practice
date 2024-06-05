package unidad12.teoriaU12.ferreteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class ProductosDAO {
	
	private String url;
	private String usuario;
	private String password;
	private Connection jdbcConnection;
	
	public ProductosDAO(String url, String usuario, String password) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}

	public boolean insertProducto(Producto producto) {
		boolean filaInsertada=false;
		
		String sentenciaSQL="INSERT INTO productos(codigo,nombre,descripcion,precio)"
				+"VALUES (?,?,?,?)";
		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, producto.getCodigo());
			sentenciaPreparada.setString(2, producto.getNombre());
			sentenciaPreparada.setString(3, producto.getDescripcion());
			sentenciaPreparada.setDouble(4, producto.getPrecio());
			
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			
			sentenciaPreparada.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return filaInsertada;
	}

	private void conectar() {
		try {
			if(jdbcConnection==null || jdbcConnection.isClosed()) {
				jdbcConnection=DriverManager.getConnection(url,usuario,password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void desconectar() {
		try {
			if(jdbcConnection!=null && !jdbcConnection.isClosed()) {
				jdbcConnection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Producto> listarTodosLosProductos(){
		List<Producto> listaDeProductos= new ArrayList<Producto>();
		
		try {
			RowSetFactory rowSetFactory= RowSetProvider.newFactory();
			JdbcRowSet rowSet= rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			rowSet.setCommand("SELECT * FROM productos");
			rowSet.execute();
			
			//Obtener numero de filas que nos devuelve la sentencia:
			int numFilas=0;
			if(rowSet.last()) {
				numFilas=rowSet.getRow();
				rowSet.beforeFirst();//Regresa el cursor a la primera posicion.
			}
			
			int contadorFilas=0;
			while(rowSet.next()) {
				Producto producto= new Producto("", "", "", 0);
				producto.setCodigo(rowSet.getString("codigo"));
				producto.setNombre(rowSet.getString("nombre"));
				producto.setDescripcion(rowSet.getString("descripcion"));
				producto.setPrecio(rowSet.getDouble("precio"));
				listaDeProductos.add(producto);
				contadorFilas++;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return listaDeProductos;
	}
	
	/*public boolean eliminarProducto(Producto producto) {
		
	}*/
	
	public boolean actualizarProducto(Producto producto) {
		boolean filaInsertada=false;
		
		String sentenciaSQL="UPDATE productos SET nombre=?,descripcion=?,precio=? WHERE codigo='"+producto.getCodigo()+"'";
		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, producto.getNombre());
			sentenciaPreparada.setString(2, producto.getDescripcion());
			sentenciaPreparada.setDouble(3, producto.getPrecio());
			
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			
			sentenciaPreparada.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return filaInsertada;
	}
	
	public Producto obtenerProducto(String codigo) {
		Producto producto= new Producto("", "", "", 0);
		try {
			RowSetFactory rowSetFactory= RowSetProvider.newFactory();
			JdbcRowSet rowSet= rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			rowSet.setCommand("SELECT * FROM productos WHERE codigo='"+codigo+"'");
			rowSet.execute();
			
			//Obtener numero de filas que nos devuelve la sentencia:
			int numFilas=0;
			if(rowSet.last()) {
				numFilas=rowSet.getRow();
				rowSet.beforeFirst();//Regresa el cursor a la primera posicion.
			}
			
			while(rowSet.next()) {
				producto.setCodigo(rowSet.getString("codigo"));
				producto.setNombre(rowSet.getString("nombre"));
				producto.setDescripcion(rowSet.getString("descripcion"));
				producto.setPrecio(rowSet.getDouble("precio"));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return producto;
	}


	
}
