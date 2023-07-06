package com.datastax.quarkus;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Encoded;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.PathSegment;

import java.util.List;

@ApplicationScoped
@Path("/path")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PathResource {
    @GET
    @Path("/list/{primaryKey: .+}")
    public String pathAsList(@PathParam("primaryKey") List<PathSegment> path) {
        return "Path(%d): %s".formatted(path.size(), path);
    }
}
