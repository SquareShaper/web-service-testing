import io.javalin.Javalin;
import io.javalin.plugin.bundled.JavalinVuePlugin;
import io.javalin.vue.VueComponent;

void main() {
    var app = Javalin.create(config -> {
        // Initial config - setup Vue
        config.staticFiles.enableWebjars();
        config.registerPlugin(new JavalinVuePlugin(vue -> {
            vue.vueInstanceNameInJs = "app";
        }));


        // All the site paths - TODO: add /favicon.ico
        config.routes.get("/", new VueComponent("home"));
        config.routes.get("/hello", new VueComponent("hello-world"));
        config.routes.get("/frog", new VueComponent("frog"));
        config.routes.get("/todo", new VueComponent("todo-list"));

    }).start(7070);
}