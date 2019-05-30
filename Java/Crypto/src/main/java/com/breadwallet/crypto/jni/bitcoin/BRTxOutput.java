package com.breadwallet.crypto.jni.bitcoin;
import com.breadwallet.crypto.jni.SizeT;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : bitcoin/BRTransaction.h:26</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class BRTxOutput extends Structure {
	/** C type : char[75] */
	public byte[] address = new byte[75];
	public long amount;
	/** C type : uint8_t* */
	public Pointer script;
	public SizeT scriptLen;
	public BRTxOutput() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("address", "amount", "script", "scriptLen");
	}
	/**
	 * @param address C type : char[75]<br>
	 * @param script C type : uint8_t*
	 */
	public BRTxOutput(byte address[], long amount, Pointer script, SizeT scriptLen) {
		super();
		if ((address.length != this.address.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.address = address;
		this.amount = amount;
		this.script = script;
		this.scriptLen = scriptLen;
	}
	public BRTxOutput(Pointer peer) {
		super(peer);
	}

    public String getAddressAsString() {
		String addressStr = new String(address, StandardCharsets.UTF_8);

		int len = addressStr.length();
		int end = 0;

		while ((end < len) && (addressStr.charAt(end) > ' ')) {
			end++;
		}

		return addressStr.substring(0, end);
    }

    public static class ByReference extends BRTxOutput implements Structure.ByReference {
		
	};
	public static class ByValue extends BRTxOutput implements Structure.ByValue {
		
	};
}