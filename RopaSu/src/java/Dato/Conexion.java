package Dato;

import Negocio.negocioLote;
import Negocio.negocioPrendas;
import java.sql.*;

public class Conexion {

    private String bd;
    private String dsn;
    private Connection cn;
    private Statement s;
    private ResultSet rs;
    private CallableStatement cstmt;

    public Conexion() {

        bd = "RopaSu";
        dsn = "jdbc:sqlserver://localhost:1433;databaseName=" + bd + ";user=Su_Ropa;password=suropaitm";

    }

    public void abrirConexion() {

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(dsn);

        } catch (Exception ex) {

            System.out.println("Error: " + ex.getMessage());

        }

    }

    public negocioPrendas ConsultarP(String codigo) {

        try {

            s = cn.createStatement();
            negocioPrendas objP;

            rs = s.executeQuery("select * from prendas where codigo = " + "'" + codigo + "'");

            rs.next();
            String c = rs.getString("codigo");
            String n = rs.getString("nombre");
            int can = rs.getInt("cantidad");
            String cla = rs.getString("clasi");
            String t = rs.getString("tiempo");
            double p = rs.getDouble("precio");

            objP = new negocioPrendas(c, n, cla, t, can, p);

            s.close();
            rs.close();
            
            return objP;

        } catch (Exception ex) {

            return null;

        }
    }

    public boolean InsertarP(String codigo, String nombre, int cant, String classi, String tiempo, double precio, String lot) {

        try {

            int filaguardada;

            s = cn.createStatement();

            filaguardada = s.executeUpdate("Insert into prendas values('" + codigo + "', '" + nombre + "', '" + cant + "', '" + classi + "', '" + tiempo + "', '" + precio + "', '" + lot + "')");

            if (filaguardada == 1) {

                return true;

            } else {

                return false;
            }

        } catch (Exception ex) {

            return false;

        }

    }
    
        public negocioLote ConsultarL(String codigo) {

        try {

            s = cn.createStatement();
            negocioLote objL;

            rs = s.executeQuery("select * from lote where codigo = " + "'" + codigo + "'");

            rs.next();
            String c = rs.getString("codigo");
            int can = rs.getInt("proceso");
            objL = new negocioLote(c,can);

            s.close();
            rs.close();
            
            return objL;

        } catch (Exception ex) {

            return null;

        }
    }
        
        public boolean InsertarL(String codigo, int proceso) {

        try {

            int filaguardada;

            s = cn.createStatement();

            filaguardada = s.executeUpdate("Insert into lote  values('" + codigo + "', '" + proceso + "')");

            if (filaguardada == 1) {

                return true;

            } else {

                return false;
            }

        } catch (Exception ex) {

            return false;

        }

    }

    public void ActualizarPT(String codigo) {
        
    }
    
    public void ActualizarPP(String codigo) {
        
    }

    public void cerrarConexion() {

        try {

            cn.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

    }

}
