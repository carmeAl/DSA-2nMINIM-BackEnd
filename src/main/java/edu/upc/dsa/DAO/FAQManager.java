package edu.upc.dsa.DAO;



import edu.upc.dsa.models.FAQ;

import java.sql.SQLException;
import java.util.List;

public interface FAQManager {

    public List<FAQ> getAllFAQ();

    public int size();

    public FAQ addFAQ(String pregunta, String respuesta);
}
