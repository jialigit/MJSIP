package org.zoolu.sip.header;

public class RAckHeader extends Header{

	public RAckHeader(long rseq, long sequenceNumber, String method) {
		super(SipHeaders.RAck, String.valueOf(rseq)+" "+String.valueOf(sequenceNumber)+" "+method);
	}
	
	public RAckHeader(Header hd) {
		super(hd);
	}

}
