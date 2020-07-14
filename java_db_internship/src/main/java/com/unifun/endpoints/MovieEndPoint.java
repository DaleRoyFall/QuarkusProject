package com.unifun.endpoints;

import com.unifun.tables.Movie;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/movie")
public class MovieEndPoint {
    @GET
    @Path("read")
    public String getMovieList() {
        return Movie.listAll().toString();
    }

    @GET
    @Path("add")
    @Transactional
    public String addMovie(@QueryParam("name") String name, @QueryParam("movieCategory") String movieCategory) {
        Movie movie = new Movie(name, movieCategory);

        movie.persist();

        return "Record added";
    }

    @GET
    @Path("update")
    @Transactional
    public String updateMovieById(@QueryParam("id") Long id, @QueryParam("name") String name, @QueryParam("movieCategory") String movieCategory) {
        Movie movie = Movie.findById(id);

        if(movie == null)
            return "Record don't exist in database.";

        movie.name = name;
        movie.movieCategory = movieCategory;

        return "Record updated";
    }

    @GET
    @Path("delete")
    @Transactional
    public String deleteMovieById(@QueryParam("id") Long id) {
        boolean deleteStatus = Movie.deleteById(id);

        return deleteStatus ? "Record deleted" : "Record don't exist in database";
    }
}