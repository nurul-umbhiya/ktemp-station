# KTemperature Station

Ambitious project of combining Kotlin, Firebase, Android and Android things just to monitor climat in my appartment


## Gist 

Android things device is running 24/7 in my appartment and periodically makes temperature (currently) and other climat measurements (e.g. humidity, CO2, etc when I figure out hardware part) and pushes this date to Firebase realtime database.

Every push triggers functions that once an hour combines readings from latest hour and creates an hourly report with some interesting data (min, max, average and array of data points) and saves it to another table in Firebase.

Android app nicely renders hourly report data.

Everything will be written in Kotlin (possibly including gradle scripts). 

Also I will try to document my finding in diary form to hopefully make it into blog post series and/or tech talks.
