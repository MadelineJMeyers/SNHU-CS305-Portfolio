package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
@RestController
class ServerController{ 
    @RequestMapping("/hash")
    public String myHash(){
    	// Example String for SHA-256 check sum
    	String data = "Hello World Check Sum!";
    	String name = "Madeline Meyers";
    	String hash = null;
    	MessageDigest messageDigest = null;
    	// Required try-catch statement in case the algorithm is not supported.
    	try {
    		messageDigest = MessageDigest.getInstance("SHA-256");
    	} catch(NoSuchAlgorithmException e) {
    		e.printStackTrace();
    	}
    	// Get bytes from input data.
    	messageDigest.update(data.getBytes());
    	// Create a byte value from messageDigest function and send it through the bytesToHex function.
    	// This creates a readable hexadecimal value for the checksum hash value.
    	byte[] digest = messageDigest.digest();
    	hash = this.bytesToHex(digest);    	
        
    	// Returned information, the name of the algorithm used, and the hash value.
        return "<p>data:"+data+"<br>Developer Name:"+name+"<br>Name of Algorithm Cipher Used: SHA-256"+"<br>Checksum hash value: " + hash+"</p>";
        
        
    }
    
    // Function built to convert a string into integer value bytes for the algorithm to encrypt into a hex string.
    // Returns a string value of the converted bytes to display after the algorithm has encrypted the input data.
    public String bytesToHex(byte[] bytes) {
    	
    	StringBuilder springBuilder = new StringBuilder();
    	for (byte hashByte : bytes) {
    		int intVal = 0xff & hashByte;
    		if (intVal < 0x10) {
    			springBuilder.append('0');
    		}
    		springBuilder.append(Integer.toHexString(intVal));
    	}
    	return springBuilder.toString();
    }
	
}