# infoList #
<p>
<blockquote><span>根据参数提取信息对象列表。</span></p>
<p>
<blockquote></p>
<table>
</blockquote><tbody>
<blockquote><tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>参数</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>说明</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>siteid</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>信息所属站点id</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>channelid</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>信息所属栏目id</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>channelParid</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>从FreeCMS 1.3 开始支持</span></p>
</blockquote><p>
<blockquote><span>栏目parid</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>num</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>每页显示数量</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>order</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>排序类型  </span></p>
</blockquote><p>
<blockquote><span>1 固顶有效并降序,发布时间降序(默认)</span></p>
</blockquote><p>
<blockquote><span>2 固顶有效并降序,发布时间升序</span></p>
</blockquote><p>
<blockquote><span>3 发布时间降序</span></p>
</blockquote><p>
<blockquote><span>4 发布时间升序</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>titleLen</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>标题显示长度</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>hot</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>是否按点击热度倒序，1是</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>dateFormat</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>日期格式</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>channelPagemark</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>栏目页面标识</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>channelParPagemark</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>从FreeCMS 1.3 开始支持</span></p>
</blockquote><p>
<blockquote><span>父栏目页面标识</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>img</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>是否只提取带图片的新闻</span><span> </span><span>1是</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>checkOpenendtime</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>从FreeCMS 1.3 开始支持</span></p>
</blockquote><p>
<blockquote><span>检查公开时限</span><span> </span><span>默认不检查，</span><span>1</span><span>检查</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>newdays</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>从FreeCMS 1.</span><span>5</span><span>开始支持</span></p>
</blockquote><p>
<blockquote><span>几天内为最新</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
</blockquote></tbody>
</table>
<p>
<blockquote></p>
<p>
</p>
<table>
</blockquote><tbody>
<blockquote><tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>返回值</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>说明</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>info</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>信息对象，类型为数据对象info</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
<tr>
<blockquote><td>
<blockquote><p>
<blockquote><span>index</span></p>
</blockquote></blockquote></td>
<td>
<blockquote><p>
<blockquote><span>索引</span></p>
</blockquote></blockquote></td>
</blockquote></tr>
</blockquote></tbody>
</table>
<p>
<blockquote></p>
<p>
</blockquote><span>示例1</span></p>
<p>
<span>根据站点id和栏目id提取信息。</span></p>
<pre><code>&lt;@infoList siteid="${site.id}" channelid="6555dd8b-7acc-4e57-a19a-cc70dd4f7135" num="2" titleLen="15"; info&gt;<br>
 &lt;H1 &gt; &lt;a href="${info.pageurl}" target="_blank"&gt;${info.showtitle}&lt;/a&gt;&lt;/H1&gt;<br>
&lt;/@infoList&gt;<br>
</code></pre>
<p>
<a href='http://static.oschina.net/uploads/space/2013/1105/081948_DODa_916014.png'><img src='http://static.oschina.net/uploads/space/2013/1105/081948_DODa_916014.png' alt='' /></a></p>
<p>
<blockquote></p>
<p>
</blockquote><span>示例2</span></p>
<p>
<span>根据站点id和栏目页面标识提取信息。</span></p>
<pre><code>&lt;@infoList siteid="${site.id}" channelPagemark="动态" num="2" titleLen="15"; info,index&gt;<br>
  &lt;H1 &gt; ${index+1} . &lt;a href="${info.pageurl}" target="_blank"&gt;${info.showtitle}&lt;/a&gt;&lt;/H1&gt;<br>
&lt;/@infoList&gt;<br>
</code></pre>
<p>
<a href='http://static.oschina.net/uploads/space/2013/1105/082007_EUEt_916014.png'><img src='http://static.oschina.net/uploads/space/2013/1105/082007_EUEt_916014.png' alt='' /></a></p>
<p>
<blockquote></p>
<p>
</blockquote><span>示例3</span></p>
<p>
<span>根据站点id和栏目页面标识提取图片信息。</span></p>
<pre><code>&lt;@infoList siteid="${site.id}" channelPagemark="动态" num="2" titleLen="15" img="1"; info,index&gt;<br>
 &lt;li &gt; &lt;a href="${info.pageurl}" target="_blank"&gt;&lt;img src="${info.img}"&gt;${info.showtitle}&lt;/a&gt;&lt;/li&gt;<br>
&lt;/@infoList&gt;<br>
</code></pre>
<p>
<a href='http://static.oschina.net/uploads/space/2013/1105/082024_1gwj_916014.png'><img src='http://static.oschina.net/uploads/space/2013/1105/082024_1gwj_916014.png' alt='' /></a></p>
<p>
<blockquote></p>
<p>
</blockquote><span>示例4</span></p>
<p>
<span>根据站点id和栏目页面标识提取信息，并设置其它参数。</span></p>
<pre><code>&lt;@infoList siteid="${site.id}" channelPagemark="动态" num="2" titleLen="15" order="2" hot="1" dateFormat="yyyy-MM-dd"; info,index&gt;<br>
  &lt;li&gt; ${index+1} . &lt;a href="${info.pageurl}" target="_blank"&gt;${info.showtitle}&lt;/a&gt;[${info.addtimeStr}]&lt;/li&gt;<br>
&lt;/@infoList&gt;<br>
</code></pre>
<p>
<a href='http://static.oschina.net/uploads/space/2013/1105/082045_RhmW_916014.png'><img src='http://static.oschina.net/uploads/space/2013/1105/082045_RhmW_916014.png' alt='' /></a></p>