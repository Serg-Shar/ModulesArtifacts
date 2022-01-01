package dev.test.modulesartifacts.core

interface UseCase<TIn, TOut> {

    fun execute(input: TIn): TOut

}