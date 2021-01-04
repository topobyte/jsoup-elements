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

package de.topobyte.jsoup.components;

import de.topobyte.jsoup.nodes.Element;

public class Img extends Element<Img>
{

	public Img()
	{
		super("img");
	}

	public Img(String src)
	{
		this();
		src(src);
	}

	public Img(String src, String alt)
	{
		this();
		src(src);
		alt(alt);
	}

	public Img src(String src)
	{
		attributes().put("src", src);
		return this;
	}

	public Img alt(String alt)
	{
		attributes().put("alt", alt);
		return this;
	}

}
