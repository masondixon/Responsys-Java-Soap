/**
 * mdixon@responsys.com
 * 2014-04-25
 * proof of concept for display pixel encryption
 * JCE libs required
 * Account also needs to be configured for display and key + prefix + pixel url values obtained from sysadmin UI component.
 */

package encryption;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang.ArrayUtils;

import encryption.aes_encrypt;

public class displayPixelEncryption
{

	String account_key;
	String account_prefix;
	String pixel_url;
	
	public String generatePixel( String account_key, String account_prefix, String pixel_url, String data_to_encrypt ) throws Exception
	{
		String pixel = null;
		
		if( account_key    != null && 
			account_prefix != null && 
			pixel_url      != null &&
			data_to_encrypt!= null )
		{
			this.account_key    = account_key;
			this.account_prefix = account_prefix;
			this.pixel_url      = pixel_url;
		}
		else
		{
			throw new Exception( " Required parameters are missing - exiting." );
		}
		
		pixel = execute( data_to_encrypt );
		
		return pixel;
	}
	
	public String execute( String data )
	{
		String append_to_pixel   = "/_";
		String pixel             = null;

		try 
		{
			aes_encrypt encryption_obj = new aes_encrypt();
			
			SecureRandom random = new SecureRandom();
		    byte init_vector[]  = random.generateSeed( 16 );
			
		    byte[] key            = Hex.decodeHex( account_key.toCharArray() );
	        byte[] prefix_bytes   = Hex.decodeHex( account_prefix.toCharArray() );
	        byte[] data_bytes     = data.getBytes("UTF-8");
	        byte[] concat_bytes   = ArrayUtils.addAll( prefix_bytes, data_bytes );
			byte[] encrypted_data = encryption_obj.encrypt( key, init_vector, concat_bytes );
			
			pixel = pixel_url + Hex.encodeHexString( init_vector ) + Hex.encodeHexString( encrypted_data ) + append_to_pixel;
			print( "encrypted pixel: " + pixel );
			
		} catch (InvalidKeyException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DecoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return pixel;
	}
	
	public boolean is_jce_supported()
	{
		
		boolean is_supported = false;
		
		try 
		{
			System.out.println("Your max cipher strength is : " + Cipher.getMaxAllowedKeyLength("AES") );
			
			if ( Cipher.getMaxAllowedKeyLength( "AES" ) == 2147483647 )
			{
				print( "Your system appears to support unlimited strength policy or JCE, a requirement of this proof." );
				is_supported = true;
			}
			else
			{
				print( "Your system does not appear to have the JCE libs installed.");
				print( "Please visit the Oracle downloads page to obtain the JCE libraries" );
				print( "http://www.oracle.com/technetwork/java/javase/downloads/index.html" );
			}
		} 
		catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
		
		return is_supported;
		
	}

	public static void print( String str )
	{
		System.out.println( str );
	}

}
