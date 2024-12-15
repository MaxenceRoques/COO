package api.utils;

import backend.exceptions.CustomerNotFoundException;
import backend.exceptions.GroupNotFoundException;
import backend.exceptions.RestaurantNotFoundException;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

/**
 * Interface servant à définir la fonction de callback qui va être fournie au moment de l'enregistrement de la Route.
 * Note : le paramètre est obligatoire même s'il est vide, on devrait pouvoir améliorer ça.
 */
@FunctionalInterface
public interface RouteHandler {
    void handle(HttpExchange exchange) throws IOException, GroupNotFoundException, CustomerNotFoundException, RestaurantNotFoundException;
}