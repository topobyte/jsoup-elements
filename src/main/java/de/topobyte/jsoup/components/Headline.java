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
import org.jsoup.parser.Tag;

public class Headline extends Element
{

	public enum Level {
		H1("h1"),
		H2("h2"),
		H3("h3"),
		H4("h4"),
		H5("h5"),
		H6("h6");

		private Tag tag;

		private Level(String name)
		{
			tag = Tag.valueOf(name);
		}
	}

	public Headline(Level level)
	{
		super(level.tag, "");
	}

	public Headline(Level level, String text)
	{
		this(level);
		appendText(text);
	}

}
