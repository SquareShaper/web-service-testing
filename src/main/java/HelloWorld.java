import io.javalin.Javalin;

void main() {
    Javalin app = Javalin.create(config -> {
        config.routes.get("/", ctx -> ctx.result("Hello World"));
    }).start(7070);
}