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

import java.util.Collection;
import java.util.Set;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
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

	public Element inner(String text)
	{
		appendText(text);
		return this;
	}

	public Node app(Node child)
	{
		appendChild(child);
		return child;
	}

	public Element app(Element child)
	{
		appendChild(child);
		return child;
	}

	@Override
	public Element attr(String attributeKey, boolean attributeValue)
	{
		super.attr(attributeKey, attributeValue);
		return this;
	}

	@Override
	public Element attr(String attributeKey, String attributeValue)
	{
		super.attr(attributeKey, attributeValue);
		return this;
	}

	@Override
	public Element appendChild(Node child)
	{
		super.appendChild(child);
		return this;
	}

	@Override
	public Element prependChild(Node child)
	{
		super.prependChild(child);
		return this;
	}

	@Override
	public Element insertChildren(int index, Collection<? extends Node> children)
	{
		super.insertChildren(index, children);
		return this;
	}

	@Override
	public Element appendText(String text)
	{
		super.appendText(text);
		return this;
	}

	@Override
	public Element prependText(String text)
	{
		super.prependText(text);
		return this;
	}

	@Override
	public Element append(String html)
	{
		super.append(html);
		return this;
	}

	@Override
	public Element prepend(String html)
	{
		super.prepend(html);
		return this;
	}

	@Override
	public Element text(String text)
	{
		super.text(text);
		return this;
	}

	@Override
	public Element addClass(String className)
	{
		super.addClass(className);
		return this;
	}

	@Override
	public Element removeClass(String className)
	{
		super.removeClass(className);
		return this;
	}

	@Override
	public Element toggleClass(String className)
	{
		super.toggleClass(className);
		return this;
	}

	@Override
	public Element classNames(Set<String> classNames)
	{
		super.classNames(classNames);
		return this;
	}

}
