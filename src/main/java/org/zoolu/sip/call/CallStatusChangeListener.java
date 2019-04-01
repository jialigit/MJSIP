package org.zoolu.sip.call;

public interface CallStatusChangeListener {
	public void callStatusChanged(Call call, int status);
}
