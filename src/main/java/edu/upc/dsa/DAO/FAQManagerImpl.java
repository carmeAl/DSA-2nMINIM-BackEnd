package edu.upc.dsa.DAO;

import edu.upc.dsa.models.*;
import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.List;

public class FAQManagerImpl implements FAQManager {
    private static FAQManager instance;

    protected List<FAQ> listaFAQ;
    final static Logger logger = Logger.getLogger(FAQManagerImpl.class);

    public FAQManagerImpl(){
        this.listaFAQ=new LinkedList<>();
    }

    public static FAQManager getInstance(){

        if(instance == null)
            instance = new FAQManagerImpl();

        return instance;
    }
    public int size(){
        return listaFAQ.size();
    }

    @Override
    public List<FAQ> getAllFAQ() {

        return this.listaFAQ;
    }

    @Override
    public FAQ addFAQ(String pregunta, String respuesta) {
        FAQ i = new FAQ(pregunta, respuesta);
        logger.info("new FAQ " + i);
        this.listaFAQ.add(i);
        logger.info("Se ha añadido un FAQ");
        return i;
    }
}