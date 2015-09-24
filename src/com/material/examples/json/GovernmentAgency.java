package com.material.examples.json;

import java.util.Set;

public class GovernmentAgency
{
	//  @JsonProperty("name")
	private String name;

	// A search term used to track a government agency
	//   @JsonProperty("searchTerms")
	private Set<String> searchTerms;

	public GovernmentAgency()
	{
	}

	public GovernmentAgency(final String name, final Set<String> searchTerms)
	{
		this.name = name;
		this.searchTerms = searchTerms;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public Set<String> getSearchTerms()
	{
		return searchTerms;
	}

	public void setSearchTerms(final Set<String> searchTerms)
	{
		this.searchTerms = searchTerms;
	}

	@Override
	public String toString() {
		return "GovernmentAgency [name=" + name + ", searchTerms="
				+ searchTerms + "]";
	}
}
