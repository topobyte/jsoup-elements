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

import de.topobyte.jsoup.components.A;
import de.topobyte.jsoup.components.Article;
import de.topobyte.jsoup.components.Aside;
import de.topobyte.jsoup.components.Audio;
import de.topobyte.jsoup.components.B;
import de.topobyte.jsoup.components.Blockquote;
import de.topobyte.jsoup.components.Body;
import de.topobyte.jsoup.components.Br;
import de.topobyte.jsoup.components.Button;
import de.topobyte.jsoup.components.Canvas;
import de.topobyte.jsoup.components.Caption;
import de.topobyte.jsoup.components.Code;
import de.topobyte.jsoup.components.Dd;
import de.topobyte.jsoup.components.DescriptionList;
import de.topobyte.jsoup.components.Details;
import de.topobyte.jsoup.components.Div;
import de.topobyte.jsoup.components.Dt;
import de.topobyte.jsoup.components.Em;
import de.topobyte.jsoup.components.Embed;
import de.topobyte.jsoup.components.FigCaption;
import de.topobyte.jsoup.components.Figure;
import de.topobyte.jsoup.components.Font;
import de.topobyte.jsoup.components.Footer;
import de.topobyte.jsoup.components.Form;
import de.topobyte.jsoup.components.Head;
import de.topobyte.jsoup.components.Header;
import de.topobyte.jsoup.components.Headline;
import de.topobyte.jsoup.components.Headline.Level;
import de.topobyte.jsoup.components.Hr;
import de.topobyte.jsoup.components.Html;
import de.topobyte.jsoup.components.I;
import de.topobyte.jsoup.components.IFrame;
import de.topobyte.jsoup.components.Img;
import de.topobyte.jsoup.components.Input;
import de.topobyte.jsoup.components.Label;
import de.topobyte.jsoup.components.Link;
import de.topobyte.jsoup.components.ListItem;
import de.topobyte.jsoup.components.Main;
import de.topobyte.jsoup.components.Mark;
import de.topobyte.jsoup.components.Meta;
import de.topobyte.jsoup.components.Nav;
import de.topobyte.jsoup.components.ObjectResource;
import de.topobyte.jsoup.components.OptGroup;
import de.topobyte.jsoup.components.Option;
import de.topobyte.jsoup.components.OrderedList;
import de.topobyte.jsoup.components.P;
import de.topobyte.jsoup.components.Pre;
import de.topobyte.jsoup.components.Q;
import de.topobyte.jsoup.components.S;
import de.topobyte.jsoup.components.Script;
import de.topobyte.jsoup.components.Section;
import de.topobyte.jsoup.components.Select;
import de.topobyte.jsoup.components.Small;
import de.topobyte.jsoup.components.Source;
import de.topobyte.jsoup.components.Span;
import de.topobyte.jsoup.components.Strong;
import de.topobyte.jsoup.components.Style;
import de.topobyte.jsoup.components.Sub;
import de.topobyte.jsoup.components.Summary;
import de.topobyte.jsoup.components.Sup;
import de.topobyte.jsoup.components.Table;
import de.topobyte.jsoup.components.TableBody;
import de.topobyte.jsoup.components.TableCell;
import de.topobyte.jsoup.components.TableFoot;
import de.topobyte.jsoup.components.TableHead;
import de.topobyte.jsoup.components.TableHeader;
import de.topobyte.jsoup.components.TableRow;
import de.topobyte.jsoup.components.TextArea;
import de.topobyte.jsoup.components.Time;
import de.topobyte.jsoup.components.Title;
import de.topobyte.jsoup.components.U;
import de.topobyte.jsoup.components.UnorderedList;
import de.topobyte.jsoup.components.Video;
import de.topobyte.jsoup.components.Wbr;

public class HTML
{

	public static Html html()
	{
		return new Html();
	}

	public static Body body()
	{
		return new Body();
	}

	public static Head head()
	{
		return new Head();
	}

	public static Title title()
	{
		return new Title();
	}

	public static Link link()
	{
		return new Link();
	}

	public static Script script()
	{
		return new Script();
	}

	public static Style style()
	{
		return new Style();
	}

	public static Style styleCss()
	{
		Style style = new Style();
		style.attr("type", "text/css");
		return style;
	}

	public static Meta meta()
	{
		return new Meta();
	}

	public static Div div()
	{
		return new Div();
	}

	public static Div div(String clazz)
	{
		return new Div(clazz);
	}

	public static P p()
	{
		return new P();
	}

	public static Hr hr()
	{
		return new Hr();
	}

	public static Headline h1()
	{
		return new Headline(Level.H1);
	}

	public static Headline h1(String text)
	{
		return new Headline(Level.H1, text);
	}

	public static Headline h2()
	{
		return new Headline(Level.H2);
	}

	public static Headline h2(String text)
	{
		return new Headline(Level.H2, text);
	}

	public static Headline h3()
	{
		return new Headline(Level.H3);
	}

	public static Headline h3(String text)
	{
		return new Headline(Level.H3, text);
	}

	public static Headline h4()
	{
		return new Headline(Level.H4);
	}

	public static Headline h4(String text)
	{
		return new Headline(Level.H4, text);
	}

	public static Headline h5()
	{
		return new Headline(Level.H5);
	}

	public static Headline h5(String text)
	{
		return new Headline(Level.H5, text);
	}

	public static Headline h6()
	{
		return new Headline(Level.H6);
	}

	public static Headline h6(String text)
	{
		return new Headline(Level.H6, text);
	}

	public static UnorderedList ul()
	{
		return new UnorderedList();
	}

	public static OrderedList ol()
	{
		return new OrderedList();
	}

	public static DescriptionList dl()
	{
		return new DescriptionList();
	}

	public static ListItem li()
	{
		return new ListItem();
	}

	public static Dd dd()
	{
		return new Dd();
	}

	public static Dt dt()
	{
		return new Dt();
	}

	public static Pre pre()
	{
		return new Pre();
	}

	public static Code code()
	{
		return new Code();
	}

	public static Blockquote blockquote()
	{
		return new Blockquote();
	}

	public static Table table()
	{
		return new Table();
	}

	public static TableHead thead()
	{
		return new TableHead();
	}

	public static TableBody tbody()
	{
		return new TableBody();
	}

	public static TableFoot tfoot()
	{
		return new TableFoot();
	}

	public static TableRow tr()
	{
		return new TableRow();
	}

	public static TableHeader th()
	{
		return new TableHeader();
	}

	public static TableCell td()
	{
		return new TableCell();
	}

	public static Caption caption()
	{
		return new Caption();
	}

	public static Br br()
	{
		return new Br();
	}

	public static Wbr wbr()
	{
		return new Wbr();
	}

	public static Span span()
	{
		return new Span();
	}

	public static A a()
	{
		return new A();
	}

	public static A a(String href)
	{
		return new A(href);
	}

	public static A a(String href, String text)
	{
		A a = new A(href);
		a.appendText(text);
		return a;
	}

	public static Img img()
	{
		return new Img();
	}

	public static Img img(String src)
	{
		return new Img(src);
	}

	public static Img img(String src, String alt)
	{
		return new Img(src, alt);
	}

	public static Font font()
	{
		return new Font();
	}

	public static B b()
	{
		return new B();
	}

	public static I i()
	{
		return new I();
	}

	public static S s()
	{
		return new S();
	}

	public static Q q()
	{
		return new Q();
	}

	public static U u()
	{
		return new U();
	}

	public static Em em()
	{
		return new Em();
	}

	public static Strong strong()
	{
		return new Strong();
	}

	public static Small small()
	{
		return new Small();
	}

	public static Sup sup()
	{
		return new Sup();
	}

	public static Sub sub()
	{
		return new Sub();
	}

	public static Form form()
	{
		return new Form();
	}

	public static Input input()
	{
		return new Input();
	}

	public static Button button()
	{
		return new Button();
	}

	public static Label label()
	{
		return new Label();
	}

	public static Select select()
	{
		return new Select();
	}

	public static Option option()
	{
		return new Option();
	}

	public static OptGroup optGroup()
	{
		return new OptGroup();
	}

	public static TextArea textarea()
	{
		return new TextArea();
	}

	public static Canvas canvas()
	{
		return new Canvas();
	}

	/*
	 * Embedding content
	 */

	public static ObjectResource object()
	{
		return new ObjectResource();
	}

	public static Embed embed()
	{
		return new Embed();
	}

	public static Audio audio()
	{
		return new Audio();
	}

	public static Video video()
	{
		return new Video();
	}

	public static IFrame iframe()
	{
		return new IFrame();
	}

	public static Source source()
	{
		return new Source();
	}

	/*
	 * Semantic elements
	 */

	public static Article article()
	{
		return new Article();
	}

	public static Aside aside()
	{
		return new Aside();
	}

	public static Details details()
	{
		return new Details();
	}

	public static FigCaption figCaption()
	{
		return new FigCaption();
	}

	public static Figure figure()
	{
		return new Figure();
	}

	public static Footer footer()
	{
		return new Footer();
	}

	public static Header header()
	{
		return new Header();
	}

	public static Main main()
	{
		return new Main();
	}

	public static Mark mark()
	{
		return new Mark();
	}

	public static Nav nav()
	{
		return new Nav();
	}

	public static Section section()
	{
		return new Section();
	}

	public static Summary summary()
	{
		return new Summary();
	}

	public static Time time()
	{
		return new Time();
	}

}
