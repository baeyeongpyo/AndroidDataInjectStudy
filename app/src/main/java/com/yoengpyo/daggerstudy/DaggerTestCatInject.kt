package com.yoengpyo.daggerstudy

import dagger.Component
import dagger.Module
import dagger.Provides

@Module
object CatModule{
    @Provides
    fun ProviderCat() = Cat()
}

class Cat{
    var name = "my cat name"
}

@Component( modules = [CatModule::class])
interface CatComponent{
    fun Inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{
        fun build() : CatComponent
        fun catModule(cat : CatModule) : Builder
    }
}