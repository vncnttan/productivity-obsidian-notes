``` js
<LabelLarge className="!text-[20px]">  
    DIREKTORAT JENDERAL AHU<br/>BUKTI PEMESANAN NOMOR VOUCHER</LabelLarge>
<LabelLarge className="!text-[#1E54B7] !text-[20px]">  
    Pemberitahuan Perubahan Data Yayasan  
</LabelLarge>
```

→ Karena Label hanya sampai dengan ukuran Large (18px) saja



``` js
<StyledTitle className="flex flex-row justify-between">
	<span className="text-[20px] leading-7 font-bold mb-0 md:mb-4">  
	    {title}  
	</span>
	...
</StyledTitle>
```
→ Seharusnya menggunakan HeadingSmall, namun karena di wrap dalam <StyledTitle> jadinya akan muncul hydration error




