# forza-sim-telemetry
Java application for reading telemetry data from FH4 and sending it to arduino. 

## Building
```
mvn clean install
```

## Starting
```
java -jar -Dport [port] -DbufferSize [<bufferSize>]
```

port is required

bufferSize is optional
