// Copyright 2018 Sebastian Kuerten
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

package de.topobyte.jsoup;

import static de.topobyte.jsoup.HTML.b;
import static de.topobyte.jsoup.HTML.div;
import static de.topobyte.jsoup.HTML.h1;
import static de.topobyte.jsoup.HTML.p;

import java.io.File;
import java.io.IOException;

import org.jsoup.nodes.Document;

import de.topobyte.jsoup.components.P;
import de.topobyte.jsoup.components.UnorderedList;
import de.topobyte.jsoup.nodes.Element;

public class TestBasics
{

	public static void main(String[] args) throws IOException
	{
		HtmlBuilder builder = new HtmlBuilder();
		builder.getHtml().attr("lang", "de");

		Element<?> body = builder.getBody();

		body.ap(h1().inner("The headline"));

		Element<?> div = body.ap(div("foo"));

		P p = div.ac(p());
		p.inner("This is a paragraph inside a div. ");

		p.ap(b().inner("Bold"));
		p.appendText(" text can be added as well");

		UnorderedList list = body.ac(HTML.ul());
		list.addTextItem("foo");
		list.addItem(HTML.a("http://foo.com", "link"));
		list.addItem().appendText("bar");

		Document doc = builder.getDocument();
		System.out.println(doc);

		builder.write(new File("/tmp/jsoup-elements-basics.html"));
	}

}
