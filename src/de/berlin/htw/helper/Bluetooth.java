 package de.berlin.htw.helper;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
//
public class Bluetooth {

	private static final String REQUEST_ENABLE_BT = null;

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chekin, if there exist Bluetooth
		BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
		if (mBluetoothAdapter == null) {
		    // Device does not support Bluetooth
		}
		
		//check if bluetooth is enabled
		if (!mBluetoothAdapter.isEnabled()) {
		    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
		    //startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
		}
		

	}

}
