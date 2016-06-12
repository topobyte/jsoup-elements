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

package de.topobyte.jsoup;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;

import de.topobyte.jsoup.nodes.Element;

public class ElementBuilder
{

	public static Element createDiv()
	{
		return create("div");
	}

	public static Element createDivWithId(String id)
	{
		return create("div", "id", id);
	}

	public static Element createDivWithClass(String className)
	{
		return create("div", "class", className);
	}

	public static Element createAnchor(String link)
	{
		Element a = create("a");
		a.attributes().put("href", link);
		return a;
	}

	public static Element createAnchor(String link, String text)
	{
		Element a = create("a");
		a.attributes().put("href", link);
		a.appendText(text);
		return a;
	}

	public static Element create(String tag)
	{
		return new Element(Tag.valueOf(tag), "");
	}

	public static Element create(String name, String... arguments)
	{
		Map<String, String> atts = new HashMap<>();
		for (int i = 0; i < arguments.length / 2; i++) {
			String key = arguments[2 * i];
			String val = arguments[2 * i + 1];
			atts.put(key, val);
		}
		return create(name, atts);
	}

	public static Element create(String name, Map<String, String> map)
	{
		Element element = create(name);
		for (Entry<String, String> entry : map.entrySet()) {
			element.attr(entry.getKey(), entry.getValue());
		}
		return element;
	}

	public static Element createWithText(String name, String content)
	{
		Element element = create(name);
		element.appendText(content);
		return element;
	}

	public static Element createWithText(String name, Map<String, String> map,
			String content)
	{
		Element element = create(name, map);
		element.appendText(content);
		return element;
	}

	public static void setStyle(Element element, String style)
	{
		element.attr("style", style);
	}

	public static Element createTextAnchor(String href, String text)
	{
		Element anchor = create("a", "href", href);
		anchor.text(text);
		return anchor;
	}

	public static Element styleSheet(String cssHref)
	{
		return create("link", "rel", "stylesheet", "type", "text/css", "href",
				cssHref);
	}

	public static Element script(String jsHref)
	{
		return create("script", "src", jsHref);
	}

	public static TextNode text(String text)
	{
		return new TextNode(text, "");
	}

	public static Comment comment(String text)
	{
		return new Comment(text, "");
	}

}
