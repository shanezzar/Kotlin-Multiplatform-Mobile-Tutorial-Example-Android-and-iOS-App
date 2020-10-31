import SwiftUI
import shared

func greet() -> String {
    return Greeting().greeting()
}

func helloWorld() -> String {
    return HelloWorld().helloWorld()
}

struct ContentView: View {
    var body: some View {
        Text(helloWorld())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
