# Android Play SafetyNet Server

## How to use

Build the jar and launch it as an endpoint REST server:

```
git clone https://github.com/typelogic/safetynetserver
cd safetynetserver/
mvn install
java -jar target/safetynetserver-0.0.1-SNAPSHOT.jar
```

Test the `/process` endpoint with `curl`:

```
curl -d 'paste attestation string here' http://localhost:8080/process
```

And example output following the `curl` command, given an attestation string:

```
{"apkCertificateDigestSha256":["EuOgsINzIFSzTDyMaeWXPIb8CyPCT0NEH0wZQ9GO7Cw="],"apkDigestSha256":"si4IzHn9Prn343FPkGkuqIY4Qzmvb5s1IowsY5+OcZA=","apkPackageName":"com.example.android.safetynetsample","basicIntegrity":true,"ctsProfileMatch":true,"evaluationType":"BASIC,HARDWARE_BACKED","nonce":"T1mupDDOCtnUCgNGfdr1V8LFyuwg2Su3U2FmZXR5IE5ldCBTYW1wbGU6IDE2Mzc5MDg2NTM0MzY=","timestampMs":1637908656371}
```
