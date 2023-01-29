package edu.upc.dsa.services;

import edu.upc.dsa.DAO.*;
import edu.upc.dsa.models.FAQ;
import edu.upc.dsa.models.Jugador;
import edu.upc.dsa.models.LogIn;
import edu.upc.dsa.models.Registro;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/faq", description = "Endpoint to Partida Service")
@Path("/faq")
public class FAQService {

    private FAQManager jm; //Gestor
    final static org.apache.log4j.Logger logger = Logger.getLogger(JugadorManagerImpl.class);

    public FAQService(){
        this.jm = FAQManagerImpl.getInstance();
        if(jm.size()==0){
            jm.addFAQ("¿Cómo paso de nivel?","Tienes que ir a la salida al acabar de cocinar");
            jm.addFAQ("¿Cuántos niveles hay?", "Hay 3 niveles");
            jm.addFAQ("¿Qué hacen los clientes?","Restan tiempo");
        }
    }


    @GET
    @ApiOperation(value = "get all FAQ", notes = "hola")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Jugador.class, responseContainer="List"),
    })
    @Path("/getAllFAQ")
    @Produces(MediaType.APPLICATION_JSON)

    public Response getAllFAQ(){
        List<FAQ> listaFAQ = this.jm.getAllFAQ();
        GenericEntity<List<FAQ>> entity = new GenericEntity<List<FAQ>>(listaFAQ) {};
        return Response.status(201).entity(entity).build()  ;
    }

}