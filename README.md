# Telldus to SmartThings app

This smartapp uses an API found at https://github.com/mariussm/Telldus-API-wrapper/ which is responsible for OAuth authentication to the Telldus API (which i didn't bother finding out how to do using a smartapp).

Currently only supports temperature/humidity sensors

## Install

- Start by installing the API from https://github.com/mariussm/Telldus-API-wrapper/ somewhere (I use Azure), or use someone else's.
- Aquire the following four things from http://api.telldus.com/keys/index
    - ConsumerKey
    - ConsumerSecret
    - Token
    - TokenSecret
- You can test the API and keys/tokens using the following PowerShell
```PowerShell
$ConsumerKey = ""
$ConsumerSecret = ""
$Token = ""
$TokenSecret = ""
$sensors = Invoke-RestMethod "https://apilocation.example.com/api/sensor?ConsumerKey=$ConsumerKey&ConsumerSecret=$ConsumerSecret&Token=Token&TokenSecret=$TokenSecret"
$sensors.sensor
```
- Install [this](./Telldus Sensor Device Handler/) device handler, which is a regular temperature / humidity sensor. No settings required.
- Install [this](./Telldus Connect SmartApp/) app. In the IDE, go to settings and set the 5 settings (example values):

| Setting        | Example value                             |
|----------------|-------------------------------------------| 
| ApiUrl         | https://apilocation.example.com/          |
| ConsumerKey    | R8KXNM8KEFCHCQD3VEWXBDELTFLP1FST          | 
| ConsumerSecret | GQ8SGUETTXWDISDJBMNKE3SGUXTOKLAZ          |
| Token          | 52c42302d5fa1a59229301ae71b27af9055b3c906 |
| TokenSecret    | 0097f6db457144d5bccf92234702ebfa          |

- Open the smartthings app and add a new smartapp from the "My apps" part
- Select the Telldus devices you want and voila, you have your telldus things as smartthings things :)
