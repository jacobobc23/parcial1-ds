package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import db.DBConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Movie;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author jacobobc
 */
public class MoviesController {

    private final Connection con;

    public MoviesController() {
        con = DBConnection.getINSTANCE().getConnection();
    }

    public ArrayList<Movie> listAllMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        String sql = "SELECT * FROM movies";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String title = rs.getString("title");
                String director = rs.getString("director");
                String genre = rs.getString("genre");
                String language = rs.getString("language");
                String productionStudio = rs.getString("production_studio");
                int yearLaunch = rs.getInt("year_launch");
                String duration = rs.getString("duration");

                Movie movie = new Movie(title, director, genre, language, productionStudio, yearLaunch, duration);
                movies.add(movie);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return movies;
    }

    public Movie selectMovie(String title) {
        String sql = "SELECT * FROM movies WHERE title = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, title.toLowerCase().trim());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String director = rs.getString("director");
                String genre = rs.getString("genre");
                String language = rs.getString("language");
                String productionStudio = rs.getString("production_studio");
                int yearLaunch = rs.getInt("year_launch");
                String duration = rs.getString("duration");

                return new Movie(title, director, genre, language, productionStudio, yearLaunch, duration);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return null;
    }

    public void insertMovie(Movie movie) throws SQLException {
        String sql = "INSERT INTO movies (title, director, genre, language, production_studio, year_launch, duration)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getDirector());
            ps.setString(3, movie.getGenre());
            ps.setString(4, movie.getLanguage());
            ps.setString(5, movie.getProductionStudio());
            ps.setInt(6, movie.getYearLaunch());
            ps.setString(7, movie.getDuration());

            ps.execute();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
            throw new SQLException();
        }
    }

    public boolean updateMovie(Movie movie) {
        String sql = "UPDATE movies SET  director = ?, genre = ?, language = ?, production_studio = ?, year_launch = ?, duration = ? WHERE title = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, movie.getDirector());
            ps.setString(2, movie.getGenre());
            ps.setString(3, movie.getLanguage());
            ps.setString(4, movie.getProductionStudio());
            ps.setInt(5, movie.getYearLaunch());
            ps.setString(6, movie.getDuration());
            ps.setString(7, movie.getTitle());

            int rowsUpdated = ps.executeUpdate();

            return rowsUpdated > 0;

        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return false;
        }
    }

    public boolean deleteMovie(String title) {
        String sql = "DELETE FROM movies WHERE title = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, title);

            int rowDeleted = ps.executeUpdate();

            return rowDeleted > 0;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return false;
    }

    public boolean titleInUse(String title) {
        String sql = "SELECT * FROM movies WHERE title = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, title);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return false;
    }
}
