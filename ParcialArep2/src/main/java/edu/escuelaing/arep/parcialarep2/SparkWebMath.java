/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.parcialarep2;

/**
 *
 * @author mac
 */

import static spark.Spark.*;
import com.google.gson.Gson;
import org.json.JSONObject;

public class SparkWebMath {
    
    private static MathServices mathServices = new MathServices();
    
    public static void main (String[] args){
        JSONObject jsonObject = new JSONObject();
        port(getPort());
        
        
        get("/atan", (req, res) -> {
            Double value = Double.valueOf(req.queryParams("value"));
            Double arctanValue = mathServices.arctan(value);
            jsonObject.put("Operación", "ArcoTangente");
            jsonObject.put("Entrada", value);
            jsonObject.put("Salida", arctanValue);
            return jsonObject.toString();
        });
        
        get("/sqrt",(req, res) -> {
            Double value = Double.valueOf(req.queryParams("value"));
            Double sqrtValue = mathServices.sqrt(value);
            jsonObject.put("Operación", "Raíz Cuadrada");
            jsonObject.put("Entrada", value);
            jsonObject.put("Salida", sqrtValue);
            return jsonObject.toString();
        });
    }
    
    public static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
