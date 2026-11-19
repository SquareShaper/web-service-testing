import io.javalin.Javalin;
import io.javalin.plugin.bundled.JavalinVuePlugin;
import io.javalin.vue.VueComponent;

void main() {
    var app = Javalin.create(config -> {
        config.staticFiles.enableWebjars();
        config.registerPlugin(new JavalinVuePlugin(vue -> {
            vue.vueInstanceNameInJs = "app";
        }));
        config.routes.get("/", new VueComponent("hello-world"));
        config.routes.get("/frog", new VueComponent("frog"));
    }).start(7070);
}