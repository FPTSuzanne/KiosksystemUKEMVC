package Model;

import java.io.IOException;
import java.sql.*;

/*
Muss noch sehr verändert werden.


public class JDBC {
    private static Connection con = null;
    private static PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private String insert = "";
    private String query = "";
    private static String connect = "db pfad";

    public JDBC(){
        try{
            Class.forName("org.sqlite.JDBC");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void delete(String table){
        try{
            con = DriverManager.getConnection(connect);
        }catch (SQLException e){
            e.printStackTrace();
        }

        try{
            switch (table){
                case "GAMELIST":
                    pstmt = con.prepareStatement("DELETE FROM GAMELIST");
                    break;
                case "TAGLIST":
                    pstmt = con.prepareStatement("DELETE FROM TAGLIST");
                    break;
            }
            pstmt.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void openWritableGames() throws IOException{
        this.delete("GAMELIST");
        insert = "INSERT INTO LIBRARY(id, exePath, screenshotPath, title, description) values(?, ?, ?, ?, ?)";
    }

    public void openReadableGames() throws IOException{
        try{
            con = DriverManager.getConnection(connect);
        }catch (SQLException e){
            e.printStackTrace();
        }

        query = "SELECT * FROM GAMELIST";
        try{
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void openWritableTags() throws IOException{
        this.delete("TAGLIST");
        insert = "INSERT INTO LIBRARY(id, tagName, category) values(?, ?, ?)";
    }

    public void openReadableTags() throws IOException{
        try{
            con = DriverManager.getConnection(connect);
        }catch (SQLException e){
            e.printStackTrace();
        }

        query = "SELECT * FROM TAGLIST";
        try{
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void writeGame(Game g)throws IOException{
        try{
            pstmt = con.prepareStatement(insert);
            pstmt.setInt(1, (int) g.getId());
            pstmt.setString(2,g.getExePath());
            pstmt.setString(3,g.getScreenshotPath());
            pstmt.setString(4,g.getTitle());
            pstmt.setString(5,g.getDescription());
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Game readGame() throws IOException, ClassNotFoundException{
        Game readGame = null;
        try{
            if(rs.next() == true){
                readGame = new Game();
                readGame.setId(rs.getInt("id"));
                readGame.setExePath(rs.getString("exePath"));
                readGame.setScreenshotPath(rs.getString("screenshotPath"));
                readGame.setTitle(rs.getString("title"));
                readGame.setDescription(rs.getString("description"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return readGame;
    }

    public void writeTag(Tag t)throws IOException{
        try{
            pstmt = con.prepareStatement(insert);
            pstmt.setInt(1, (int) t.getId());
            pstmt.setString(2,t.getTagName());
            pstmt.setString(3,t.getCategory());
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Tag readTag() throws IOException, ClassNotFoundException{
        Tag readTag = null;
        try{
            if(rs.next() == true){
                readTag = new Tag();
                readTag.setId(rs.getInt("id"));
                readTag.setTagName(rs.getString("tagName"));
                readTag.setCategory(rs.getString("category"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return readTag;
    }

    public void closeReadable(){
        try{
            rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try{
            pstmt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void closeWritable(){
        try{
            pstmt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}*/
