// Copyright 2016 Sebastian Kuerten
//
// This file is part of jsoup-elements.
//
// jsoup-elements is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// jsoup-elements is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with jsoup-elements. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Tag;

public class Element extends org.jsoup.nodes.Element
{

	public Element(String tag)
	{
		super(Tag.valueOf(tag), "");
	}

	public Element(String tag, Attributes attributes)
	{
		super(Tag.valueOf(tag), "", attributes);
	}

	public Element(Tag tag)
	{
		super(tag, "");
	}

	public Element(Tag tag, Attributes attributes)
	{
		super(tag, "", attributes);
	}

	public Element(Tag tag, String baseUri)
	{
		super(tag, baseUri);
	}

	public Element(Tag tag, String baseUri, Attributes attributes)
	{
		super(tag, baseUri, attributes);
	}

}
