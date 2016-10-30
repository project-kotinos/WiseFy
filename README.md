# WiFiManager
Util library used as a wrapper around WiFi and Connectivity manager for Android

> <br/>*Developed by Patches 04/24/2016 - present* <br/><br/>

[![Build Status](https://travis-ci.org/isuPatches/WiseFy.svg?branch=master)](https://travis-ci.org/isuPatches/WiseFy)

[ ![Download](https://api.bintray.com/packages/isupatches/Maven/wisefy/images/download.svg) ](https://bintray.com/isupatches/Maven/wisefy/_latestVersion)

## Adding to your project

Gradle:

```
compile 'com.isupatches:wisefy:1.0.5'
```

Maven:

```
<dependency>
  <groupId>com.isupatches</groupId>
  <artifactId>wisefy</artifactId>
  <version>1.0.5</version>
  <type>pom</type>
</dependency>
```

## Getting An Instance

WiseFy now supports the builder pattern so cool functionality can be added later!

To grab a default instance:

```java
WiseFy mWiseFy = new WiseFy.withContext(getActivity()).getSmarts();
```

To grab an instance with logging enabled:

```java
WiseFy mWiseFy = new WiseFy.withContext(getActivity()).logging(true).getSmarts();
```

## Commands

To add an open network:

```java
int addedSuccessfully = mWiseFy.addOpenNetwork("Open Network");
```

To add a WEP network:

```java
int addedSuccessfully = mWiseFy.addWEPNetwork("WEP Network", "123456");
```

To add a WPA2 network:

```java
int addedSuccessfully = mWiseFy.addWPA2Network("WPA2 Network", "12345678");
```

To calculate number of bars given a networks signal strength and total number of bars:

```java
int bars = mWiseFy.calculateBars(-35, -5);
```

To compare the signal strength of two networks:

```java
int result = mWiseFy.compareSignalLevel(-35, -70);
```

To connect to a network given an SSID:

```java
boolean connectedSuccessfully = mWiseFy.connectToNetwork("SSID To Reconnect To", 3000);
```

To disable wifi:

```java
boolean disabledWifiSuccessfully = mWiseFy.disableWifi();
```

To disconnect from current network:

```java
boolean disconnectedSuccessfully = mWiseFy.disconnectFromCurrentNetwork();
```

To enable wifi:

```java
boolean wifiEnabled = mWiseFy.enableWiFi();
```

To get current network:

```java
WifiInfo currentNetwork = mWiseFy.getCurrentNetwork();
```

To get nearby access points:<br/><br/>
<strong>Setting filterDuplicates to true will not return SSIDs with a weaker signal strength (will always take the highest)</strong>

```java
List<ScanResult> nearbyAccessPoints = mWiseFy.getNearbyAccessPoints(true);
```

To get the networks whose configuration is already stored:

```java
List<WifiConfiguration> savedNetworks = mWiseFy.getSavedNetworks();
```

To check and see if the device is connected to a mobile network:

```java
boolean isConnected = mWiseFy.isDeviceConnectedToMobileNetwork();
```

To check and see if the device is connected to a mobile or wifi network:

```java
boolean isConnected = mWiseFy.isDeviceConnectedToMobileOrWifiNetwork();
```

To check and see if the device is connected to a given SSID:

```java
boolean isConnected = mWiseFy.isDeviceConnectedToSSID("SSID");
```

To check and see if the device is connected to a wifi network:

```java
boolean isConnected = mWiseFy.isDeviceConnectedToWifiNetwork("SSID");
```

To check and see if a given SSID is in the devices set of configured networks:

```java
boolean isConfigured = mWiseFy.isNetworkInConfigurationList("SSID");
```

To check and see if a network is secure (WEP/PSK/EAP capabilities):

```java
boolean isSecure = mWiseFy.isNetworkSecure(scanResult);
```

To check and see if Wifi is enabled on a device:

```java
boolean wifiEnabled = mWiseFy.isWifiEnabled();
```

To remove a configured network:

```java
boolean removedSuccessfully = mWiseFy.removeNetwork("SSID To Remove");
```

To search for an SSID given a search string:

```java
String ssid = mWiseFy.searchForSSID("SSID To Search For", 3000);
```

## License ##
Copyright 2016 Patches Klinefelter

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License
is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
or implied. See the License for the specific language governing permissions and limitations under
the License.