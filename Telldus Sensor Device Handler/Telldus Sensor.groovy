metadata {
	definition (name: "Telldus Sensor", namespace: "mariussm", author: "Marius Solbakken") {
		capability "Sensor"
		capability "Relative Humidity Measurement"
		capability "Temperature Measurement"
	}

	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		valueTile("temperature", "device.temperature", width: 2, height: 2) {
 			state("temperature", label: '${currentValue}°', backgroundColors: [
 				[value: 31, color: "#153591"],
 				[value: 44, color: "#1e9cbb"],
 				[value: 59, color: "#90d2a7"],
 				[value: 74, color: "#44b621"],
 				[value: 84, color: "#f1d801"],
 				[value: 95, color: "#d04e00"],
 				[value: 96, color: "#bc2323"]
 				]
 				)
 		}
 		valueTile("humidity", "device.humidity", inactiveLabel: false) {
 			state "humidity", label:'${currentValue}%', unit:"Humidity"
 		}
 		standardTile("refresh", "device.thermostatMode", inactiveLabel: false, decoration: "flat") {
 			state "default", action:"device.poll", icon:"st.secondary.refresh"
 		}
 		main (["temperature", "humidity"])
 		details(["temperature", "humidity", "refresh"])
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "NOT IMPLEMENTED: Parsing '${description}'"
	// TODO: handle 'humidity' attribute
	// TODO: handle 'temperature' attribute
	// TODO: handle 'carbonDioxide' attribute
	// TODO: handle 'noise' attribute
	// TODO: handle 'pressure' attribute

}

def poll() {
	parent.poll()
}