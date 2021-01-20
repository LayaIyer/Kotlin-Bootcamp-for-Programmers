package Aquarium

import kotlin.reflect.*
import kotlin.reflect.full.*

@ImAPlant class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = true

    @set: OnSet
    var needsFood: Boolean = false
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun reflections() {
    val classObj: KClass<Plant> = Plant::class

    //print all annotations
    for (annotation: Annotation in classObj.annotations) {
        println(annotation.annotationClass.simpleName)
    }

    //find one annotation, or null
    //val annotated:ImAPlant? = classObj.findAnnotation<ImAPlant>()

    //annotated?.apply {
       // println("Found a plant annotation!")
    //}
}