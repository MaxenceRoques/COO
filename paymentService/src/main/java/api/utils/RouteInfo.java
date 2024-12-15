package api.utils;

/**
 * Contient les infos sur une route, ainsi que la logique permettant notamment de récupérer des paramètres dans l'URL, tels que /api/members/{memberId}
 */
public class RouteInfo {
    public String method;
    public String path;
    private RouteHandler handler;

    public RouteInfo(String method, String path, RouteHandler handler) {
        this.method = method;
        this.path = path;
        this.handler = handler;
    }

    public boolean matches(String method, String requestPath) {
        return this.method.equalsIgnoreCase(method) && path.equalsIgnoreCase(requestPath);
    }

    public RouteHandler getHandler() {
        return handler;
    }
}