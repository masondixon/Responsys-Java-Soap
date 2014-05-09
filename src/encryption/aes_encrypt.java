package encryption;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.DecoderException;

public class aes_encrypt
{
	public byte[] encrypt( byte[] key, byte[] init_vector, byte[] data_to_encrypt ) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, NoSuchProviderException, DecoderException 
	{
        SecretKeySpec key_spec = new SecretKeySpec( key, "AES");
        Cipher cipher = Cipher.getInstance( "AES/CBC/PKCS5Padding" );
        IvParameterSpec iv = new IvParameterSpec( init_vector );
        cipher.init( Cipher.ENCRYPT_MODE, key_spec, iv );
        byte[] encrypted = cipher.doFinal( data_to_encrypt );

        return encrypted;
    }
}
