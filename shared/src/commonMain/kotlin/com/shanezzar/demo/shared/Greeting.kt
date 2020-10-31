package com.shanezzar.demo.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

}
