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

public abstract class Element<E extends Element<E>>
		extends org.jsoup.nodes.Element
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

	public E inner(String text)
	{
		appendText(text);
		return getThis();
	}

	public E getThis()
	{
		return (E) this;
	}

	public <T extends Node> T ac(T child)
	{
		appendChild(child);
		return child;
	}

	@Override
	public E attr(String attributeKey, boolean attributeValue)
	{
		super.attr(attributeKey, attributeValue);
		return getThis();
	}

	@Override
	public E attr(String attributeKey, String attributeValue)
	{
		super.attr(attributeKey, attributeValue);
		return getThis();
	}

	public E ap(Node child)
	{
		return appendChild(child);
	}

	@Override
	public E appendChild(Node child)
	{
		super.appendChild(child);
		return getThis();
	}

	@Override
	public E prependChild(Node child)
	{
		super.prependChild(child);
		return getThis();
	}

	@Override
	public E insertChildren(int index, Collection<? extends Node> children)
	{
		super.insertChildren(index, children);
		return getThis();
	}

	public Element at(String text)
	{
		return appendText(text);
	}

	@Override
	public E appendText(String text)
	{
		super.appendText(text);
		return getThis();
	}

	@Override
	public E prependText(String text)
	{
		super.prependText(text);
		return getThis();
	}

	@Override
	public E append(String html)
	{
		super.append(html);
		return getThis();
	}

	@Override
	public E prepend(String html)
	{
		super.prepend(html);
		return getThis();
	}

	@Override
	public E text(String text)
	{
		super.text(text);
		return getThis();
	}

	@Override
	public E addClass(String className)
	{
		super.addClass(className);
		return getThis();
	}

	public E addClasses(Collection<String> classNames)
	{
		for (String className : classNames) {
			super.addClass(className);
		}
		return getThis();
	}

	@Override
	public E removeClass(String className)
	{
		super.removeClass(className);
		return getThis();
	}

	public E removeClasses(Collection<String> classNames)
	{
		for (String className : classNames) {
			super.removeClass(className);
		}
		return getThis();
	}

	@Override
	public E toggleClass(String className)
	{
		super.toggleClass(className);
		return getThis();
	}

	@Override
	public E classNames(Set<String> classNames)
	{
		super.classNames(classNames);
		return getThis();
	}

}
