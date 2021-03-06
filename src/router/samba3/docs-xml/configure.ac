AC_INIT(xslt/latex.xsl)

AC_ARG_WITH(samba-sources,
[ --with-samba-sources=DIR Specify path to Samba sources],
[ test "$withval" && SPECIFIED_SOURCEDIR="$withval" ])

LATEX_DOCUMENTCLASS_OPTIONS="letterpaper,11pt,openright,twoside"
AC_ARG_ENABLE(prentice-hall,
[ --enable-prentice-hall     Produce Prentice-Hall compatible output],
[ test "$enableval" && LATEX_DOCUMENTCLASS_OPTIONS="letterpaper,10pt,openleft,twoside,ph" ])
AC_SUBST(LATEX_DOCUMENTCLASS_OPTIONS)

DOC_BUILD_DATE=`date '+%d-%m-%Y'`
AC_SUBST(DOC_BUILD_DATE)
AC_SUBST(SAMBASOURCEDIR)

DOCS_TARGET_REQUIRE_PROGRAM(XSLTPROC, xsltproc, ALL)
DOCS_TARGET_REQUIRE_PROGRAM(RM, rm, ALL)
dnl DOCS_TARGET_REQUIRE_PROGRAM(DIA, dia, LATEX)
dnl DOCS_TARGET_REQUIRE_PROGRAM(DIA, dia, PS)
dnl DOCS_TARGET_REQUIRE_PROGRAM(DIA, dia, PDF)
dnl DOCS_TARGET_REQUIRE_PROGRAM(DIA, dia, HTML)
dnl DOCS_TARGET_REQUIRE_PROGRAM(DIA, dia, HTMLHELP)
dnl DOCS_TARGET_REQUIRE_PROGRAM(DIA, dia, PEARSON)
dnl DOCS_TARGET_REQUIRE_PROGRAM(DIA, dia, PLUCKER)
dnl DOCS_TARGET_REQUIRE_PROGRAM(DIA, dia, FOPDF)
DOCS_TARGET_REQUIRE_PROGRAM(INKSCAPE, inkscape, LATEX)
DOCS_TARGET_REQUIRE_PROGRAM(INKSCAPE, inkscape, PS)
DOCS_TARGET_REQUIRE_PROGRAM(INKSCAPE, inkscape, PDF)
DOCS_TARGET_REQUIRE_PROGRAM(INKSCAPE, inkscape, HTML)
DOCS_TARGET_REQUIRE_PROGRAM(INKSCAPE, inkscape, HTMLHELP)
DOCS_TARGET_REQUIRE_PROGRAM(INKSCAPE, inkscape, PEARSON)
DOCS_TARGET_REQUIRE_PROGRAM(INKSCAPE, inkscape, PLUCKER)
DOCS_TARGET_REQUIRE_PROGRAM(INKSCAPE, inkscape, FOPDF)
# Check dia version number

#if test -n "$DIA"; then
#   [ DIA_VERSION=`$DIA -v | egrep -o '([0-9]+)\.([0-9]+)'`]
#   DIA_MAJ_VERSION=`echo $DIA_VERSION | cut -d . -f 1`
#   DIA_MIN_VERSION=`echo $DIA_VERSION | cut -d . -f 2`

#   if test "$DIA_MAJ_VERSION" -le "0"
#   then
#	if test "$DIA_MIN_VERSION" -le "92" && test -z "$DISPLAY"
#	then
#		AC_MSG_ERROR([Dia below 0.93 requires an X environment. Set \$DISPLAY or install Dia 0.93 or higher])
#	fi
#   fi   
#fi

DOCS_TARGET_REQUIRE_PROGRAM(MAKEINDEX, makeindex, LATEX)
DOCS_TARGET_REQUIRE_PROGRAM(PDFLATEX, pdflatex, PDF)
DOCS_TARGET_REQUIRE_PROGRAM(EPSTOPDF, epstopdf, PDF)
DOCS_TARGET_REQUIRE_PROGRAM(THUMBPDF, thumbpdf, PDF)
DOCS_TARGET_REQUIRE_PROGRAM(PNGTOPNM, pngtopnm, PS)
DOCS_TARGET_REQUIRE_PROGRAM(PNMTOPS, pnmtops, PS)
DOCS_TARGET_REQUIRE_PROGRAM(LATEX, latex, PS)
DOCS_TARGET_REQUIRE_PROGRAM(DVIPS, dvips, PS)
DOCS_TARGET_REQUIRE_PROGRAM(PLUCKERBUILD, plucker-build, PLUCKER)
DOCS_TARGET_REQUIRE_PROGRAM(HTML2TEXT, html2text, TXT)
DOCS_TARGET_REQUIRE_PROGRAM(PERL, perl, UNDOCUMENTED)
DOCS_TARGET_REQUIRE_PROGRAM(XMLLINT, xmllint, VALIDATE)
DOCS_TARGET_REQUIRE_PROGRAM(FOP, fop, FOPDF)
DOCS_TARGET_REQUIRE_PROGRAM(DB2TEXI, docbook2x-texi, TEXI)
DOCS_TARGET_REQUIRE_PROGRAM(MAKEINFO, makeinfo, TEXIINFO)
DOCS_TARGET_REQUIRE_DIR([$SPECIFIED_SOURCEDIR $SPECIFIED_SOURCEDIR/source ..], [param/loadparm.c], SAMBASOURCEDIR, UNDOCUMENTED)

AC_MSG_RESULT([])
AC_MSG_RESULT([Summary:])
AC_MSG_RESULT([--------------])

DOCS_DEFINE_TARGET(ALL, [], [base requirements], [])
DOCS_DEFINE_TARGET(LATEX, ALL, [LaTeX versions], [tex])
DOCS_DEFINE_TARGET(PDF, LATEX, [PDF versions], [pdf])
DOCS_DEFINE_TARGET(PS, LATEX, [PostScript versions], [ps])
DOCS_DEFINE_TARGET(HTML, ALL, [HTML versions], [html])
DOCS_DEFINE_TARGET(HTMLHELP, ALL, [HTML Help versions], [htmlhelp])
DOCS_DEFINE_TARGET(HTMLMAN, ALL, [HTML versions of the manpages], [htmlman3])
DOCS_DEFINE_TARGET(MANPAGES, ALL, [manpages], [manpages3])
DOCS_DEFINE_TARGET(PEARSON, ALL, [pearson-compatible XML], [pearson])
DOCS_DEFINE_TARGET(PLUCKER, HTML, [plucker versions], [plucker])
DOCS_DEFINE_TARGET(VALIDATE, ALL, [validating docbook output], [])
DOCS_DEFINE_TARGET(FOPDF, ALL, [PDF versions thru FO], [fo-pdf])
DOCS_DEFINE_TARGET(TEXI, ALL, [TexInfo versions], [texi])
DOCS_DEFINE_TARGET(TEXIINFO, ALL, [TexInfo Info versions], [texiinfo])
DOCS_DEFINE_TARGET(UNDOCUMENTED, MANPAGES, [list of undocumented options], [undocumented])
DOCS_DEFINE_TARGET(TXT, HTML, [text versions], [txt])

if test x"$TARGETS" = x; then 
	AC_MSG_ERROR([You won't be able to build any of the docs])
else 
	AC_MSG_RESULT([You will be able to build: $TARGETS])
fi

AC_SUBST(TARGETS)

AC_OUTPUT( Makefile.settings build/catalog.xml)
