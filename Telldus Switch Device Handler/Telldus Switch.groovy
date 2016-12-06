metadata {
	definition (name: "Telldus Switch", namespace: "mariussm", author: "Marius Solbakken") {
		capability "Actuator"
		capability "Switch"
		capability "Configuration"
		capability "Polling"
		capability "Refresh"
	}

	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
    	multiAttributeTile(name:"switch", type:"lighting", width:6, height:4, canChangeIcon: true) {
    		tileAttribute("device.switch", key: "PRIMARY_CONTROL") {
              attributeState "on", label: '${name}', action: "switch.off", icon: "st.switches.switch.on", backgroundColor: "#79b821"
              attributeState "off", label: '${name}', action: "switch.on", icon: "st.switches.switch.off", backgroundColor: "#ffffff"
    		}
        }
        
        main "switch"
		details(["switch"])
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

def on() {
}

def off() {
}