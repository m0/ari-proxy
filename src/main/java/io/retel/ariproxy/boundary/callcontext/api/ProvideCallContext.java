package io.retel.ariproxy.boundary.callcontext.api;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ProvideCallContext implements Serializable {

	private final String callContext;
	private final ProviderPolicy policy;

	public ProvideCallContext(String callContext, ProviderPolicy policy) {
		this.callContext = callContext;
		this.policy = policy;
	}

	public String callContext() {
		return callContext;
	}

	public ProviderPolicy policy() {
		return policy;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
