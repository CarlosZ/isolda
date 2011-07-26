package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder

class Recipe {

    String name
    String description
    int minutesToComplete
    RecipeDifficulty difficulty

    static belongsTo = [dietaryProgram: DietaryProgram]

    static constraints = {
        name(maxSize: 100)
        description(maxSize: 5000)
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Recipe recipe = (Recipe) o

        if (minutesToComplete != recipe.minutesToComplete) return false
        if (description != recipe.description) return false
        if (difficulty != recipe.difficulty) return false
        if (name != recipe.name) return false
        if (dietaryProgram != recipe.dietaryProgram) return false

        return true
    }

    @Override
    def int hashCode() {
        int result = 17
        result = 31 * result + (name != null ? name.hashCode() : 0)
        result = 31 * result + (description != null ? description.hashCode() : 0)
        result = 31 * result + minutesToComplete
        result = 31 * result + (difficulty != null ? difficulty.hashCode() : 0)
        result = 31 * result + (dietaryProgram != null ? dietaryProgram.hashCode() : 0)
        return result
    }

    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("description", description).
                append("name", name).
                append("minutesToComplete", minutesToComplete).
                append("difficulty", difficulty).
                append("dietaryProgram", dietaryProgram).
                toString()
    }
}
