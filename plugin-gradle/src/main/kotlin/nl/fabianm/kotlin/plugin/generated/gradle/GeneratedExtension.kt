/*
 * Copyright 2018 Fabian Mastenbroek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.fabianm.kotlin.plugin.generated.gradle

/**
 * The available Gradle configuration for this plugin.
 */
open class GeneratedExtension {
    /**
     * The annotation to use for annotating generated methods.
     */
    var annotation: String? = null

    /**
     * A flag to make the annotations visible during runtime.
     */
    var visible: Boolean = false

    /**
     * Set the annotation to use for annotating generated methods.
     */
    open fun annotation(fqName: String) {
        annotation = fqName
    }

    /**
     * Set the runtime visibility of the annotations.
     */
    open fun visible(visible: Boolean) {
        this.visible = visible
    }
}
