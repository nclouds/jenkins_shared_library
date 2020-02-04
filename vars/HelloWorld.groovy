import org.ncloud.build.HelloWorld
import org.ncloud.ioc.ContextRegistry

def call(String solutionPath) {
    ContextRegistry.registerDefaultContext(this)

    def helloworld = new HelloWorld(solutionPath)
    helloworld.build()
}