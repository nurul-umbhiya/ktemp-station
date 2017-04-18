external fun require(module: String): dynamic
external val exports: dynamic

fun main(args: Array<String>) {
    val functions = require("firebase-functions")
    val admin = require("firebase-admin")
    admin.initializeApp(functions.config().firebase)

    exports.saveString = functions.https.onRequest { req, res ->
        val text = req.query.text

        admin.database().ref("/testMessage").push(text).then {
            res.status(200).send("Saved: $text")
        }
    }
}
