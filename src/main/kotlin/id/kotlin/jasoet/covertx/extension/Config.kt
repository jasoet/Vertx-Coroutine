package id.kotlin.jasoet.covertx.extension

import io.vertx.config.ConfigStoreOptions
import io.vertx.kotlin.config.ConfigStoreOptions
import io.vertx.kotlin.core.json.json
import io.vertx.kotlin.core.json.obj

/**
 * [Documentation Here]
 *
 * @author Deny Prasetyo
 */
fun propertiesConfig(path: String): ConfigStoreOptions {
    return ConfigStoreOptions(
        type = "file",
        format = "properties",
        config = json {
            obj("path" to path)
        }
    )
}

fun jsonConfig(path: String): ConfigStoreOptions {
    return ConfigStoreOptions(
        type = "file",
        format = "json",
        config = json {
            obj("path" to path)
        }
    )
}



