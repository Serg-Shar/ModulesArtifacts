package dev.test.modulesartifacts.feature2

import dev.test.modulesartifacts.core.UseCase

class Feature2 : UseCase<Boolean, Boolean> {

    override fun execute(input: Boolean): Boolean {
        return !input
    }

}