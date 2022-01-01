package dev.test.modulesartifacts.feature1

import dev.test.modulesartifacts.core.UseCase

class Feature1 : UseCase<Int, String> {

    override fun execute(input: Int): String {
        return "S-${input * input}"
    }

}